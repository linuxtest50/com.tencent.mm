.class public final Lcom/tencent/mm/d/a/is;
.super Lcom/tencent/mm/sdk/c/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/d/a/is$a;
    }
.end annotation


# static fields
.field public static atN:Z

.field public static atO:Z


# instance fields
.field public aFT:Lcom/tencent/mm/d/a/is$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 6
    sput-boolean v0, Lcom/tencent/mm/d/a/is;->atN:Z

    .line 7
    sput-boolean v0, Lcom/tencent/mm/d/a/is;->atO:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/d;-><init>()V

    .line 13
    new-instance v0, Lcom/tencent/mm/d/a/is$a;

    invoke-direct {v0}, Lcom/tencent/mm/d/a/is$a;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/d/a/is;->aFT:Lcom/tencent/mm/d/a/is$a;

    .line 8
    const-string/jumbo v0, "TraceOperation"

    iput-object v0, p0, Lcom/tencent/mm/d/a/is;->id:Ljava/lang/String;

    sget-boolean v0, Lcom/tencent/mm/d/a/is;->atO:Z

    iput-boolean v0, p0, Lcom/tencent/mm/d/a/is;->hXT:Z

    return-void
.end method