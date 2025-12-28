.class public final LB2/F;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:LB2/G;

.field public h:LB2/f;

.field public i:LB2/H;

.field public j:Ly2/S;

.field public k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:LB2/G;

.field public n:I


# direct methods
.method public constructor <init>(LB2/G;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LB2/F;->m:LB2/G;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LB2/F;->l:Ljava/lang/Object;

    iget p1, p0, LB2/F;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LB2/F;->n:I

    iget-object p1, p0, LB2/F;->m:LB2/G;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LB2/G;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method
