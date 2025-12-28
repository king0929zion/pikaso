.class public final Lr/h;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:Lh0/p;

.field public h:Lh0/g;

.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public k:I


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr/h;->j:Ljava/lang/Object;

    iget p1, p0, Lr/h;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr/h;->k:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p1, p0}, Lr/p;->a(Lh0/p;ZLh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
