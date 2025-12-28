.class public abstract LN/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:LN/A;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v0

    iput v0, p0, LN/A;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(LN/A;)V
.end method

.method public abstract b()LN/A;
.end method
