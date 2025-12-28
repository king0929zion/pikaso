.class public final LB2/o;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:Lo2/e;

.field public h:Lp2/o;

.field public i:LB2/n;

.field public synthetic j:Ljava/lang/Object;

.field public k:I


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/o;->j:Ljava/lang/Object;

    iget p1, p0, LB2/o;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/o;->k:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, LB2/w;->d(LB2/e;Lo2/e;Li2/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
