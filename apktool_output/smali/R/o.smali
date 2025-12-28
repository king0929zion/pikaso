.class public final Lr/o;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:Lh0/p;

.field public h:Lh0/g;

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr/o;->i:Ljava/lang/Object;

    iget p1, p0, Lr/o;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr/o;->j:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lr/p;->b(Lh0/p;Lh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
