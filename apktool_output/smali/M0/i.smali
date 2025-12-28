.class public abstract LM0/i;
.super LM0/d;
.source "SourceFile"


# instance fields
.field public d0:[LM0/d;

.field public e0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LM0/d;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [LM0/d;

    iput-object v0, p0, LM0/i;->d0:[LM0/d;

    const/4 v0, 0x0

    iput v0, p0, LM0/i;->e0:I

    return-void
.end method


# virtual methods
.method public B()V
    .locals 0

    return-void
.end method
