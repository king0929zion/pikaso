.class public abstract LC/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:J

.field public static final B:J

.field public static final C:J

.field public static final D:Lz0/l;

.field public static final E:Lz0/n;

.field public static final F:J

.field public static final G:J

.field public static final H:J

.field public static final I:Lz0/l;

.field public static final J:Lz0/n;

.field public static final K:J

.field public static final L:J

.field public static final M:J

.field public static final N:Lz0/l;

.field public static final O:Lz0/n;

.field public static final P:J

.field public static final Q:J

.field public static final R:J

.field public static final S:Lz0/l;

.field public static final T:Lz0/n;

.field public static final U:J

.field public static final V:J

.field public static final W:J

.field public static final X:Lz0/l;

.field public static final Y:Lz0/n;

.field public static final Z:J

.field public static final a:Lz0/n;

.field public static final a0:J

.field public static final b:J

.field public static final b0:J

.field public static final c:J

.field public static final c0:Lz0/l;

.field public static final d:J

.field public static final d0:Lz0/n;

.field public static final e:Lz0/l;

.field public static final e0:J

.field public static final f:Lz0/n;

.field public static final f0:J

.field public static final g:J

.field public static final g0:J

.field public static final h:J

.field public static final h0:Lz0/l;

.field public static final i:J

.field public static final i0:Lz0/n;

.field public static final j:Lz0/l;

.field public static final j0:J

.field public static final k:Lz0/n;

.field public static final k0:J

.field public static final l:J

.field public static final l0:J

.field public static final m:J

.field public static final m0:Lz0/l;

.field public static final n:J

.field public static final n0:Lz0/n;

.field public static final o:Lz0/l;

.field public static final o0:J

.field public static final p:Lz0/n;

.field public static final p0:J

.field public static final q:J

.field public static final q0:J

.field public static final r:J

.field public static final r0:Lz0/l;

.field public static final s:J

.field public static final s0:Lz0/n;

.field public static final t:Lz0/l;

.field public static final t0:J

.field public static final u:Lz0/n;

.field public static final u0:J

.field public static final v:J

.field public static final v0:J

.field public static final w:J

.field public static final w0:Lz0/l;

.field public static final x:J

.field public static final y:Lz0/l;

.field public static final z:Lz0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    sget-object v0, LC/h;->a:Lz0/l;

    sget-object v0, Lz0/r;->b:Lz0/n;

    sput-object v0, LC/g;->a:Lz0/n;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    invoke-static {v1, v2}, La/a;->K(D)J

    move-result-wide v3

    sput-wide v3, LC/g;->b:J

    const/16 v3, 0x10

    invoke-static {v3}, La/a;->L(I)J

    move-result-wide v4

    sput-wide v4, LC/g;->c:J

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    invoke-static {v4, v5}, La/a;->K(D)J

    move-result-wide v6

    sput-wide v6, LC/g;->d:J

    sget-object v6, LC/h;->b:Lz0/l;

    sput-object v6, LC/g;->e:Lz0/l;

    sput-object v0, LC/g;->f:Lz0/n;

    const-wide/high16 v7, 0x4034000000000000L    # 20.0

    invoke-static {v7, v8}, La/a;->K(D)J

    move-result-wide v9

    sput-wide v9, LC/g;->g:J

    const/16 v9, 0xe

    invoke-static {v9}, La/a;->L(I)J

    move-result-wide v10

    sput-wide v10, LC/g;->h:J

    const-wide v10, 0x3fc999999999999aL    # 0.2

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v12

    sput-wide v12, LC/g;->i:J

    sput-object v6, LC/g;->j:Lz0/l;

    sput-object v0, LC/g;->k:Lz0/n;

    const-wide/high16 v12, 0x4030000000000000L    # 16.0

    invoke-static {v12, v13}, La/a;->K(D)J

    move-result-wide v14

    sput-wide v14, LC/g;->l:J

    const/16 v14, 0xc

    invoke-static {v14}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->m:J

    const-wide v15, 0x3fd999999999999aL    # 0.4

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->n:J

    sput-object v6, LC/g;->o:Lz0/l;

    sput-object v0, LC/g;->p:Lz0/n;

    const-wide/high16 v15, 0x4050000000000000L    # 64.0

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->q:J

    const/16 v15, 0x39

    invoke-static {v15}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->r:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, La/a;->S(J)Z

    move-result v17

    if-nez v17, :cond_0

    const-wide v17, 0xff00000000L

    and-long v10, v15, v17

    invoke-static/range {v15 .. v16}, LG0/h;->c(J)F

    move-result v15

    neg-float v15, v15

    invoke-static {v10, v11, v15}, La/a;->W(JF)J

    move-result-wide v10

    sput-wide v10, LC/g;->s:J

    sput-object v6, LC/g;->t:Lz0/l;

    sput-object v0, LC/g;->u:Lz0/n;

    const-wide/high16 v10, 0x404a000000000000L    # 52.0

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v10

    sput-wide v10, LC/g;->v:J

    const/16 v10, 0x2d

    invoke-static {v10}, La/a;->L(I)J

    move-result-wide v10

    sput-wide v10, LC/g;->w:J

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->x:J

    sput-object v6, LC/g;->y:Lz0/l;

    sput-object v0, LC/g;->z:Lz0/n;

    const-wide/high16 v15, 0x4046000000000000L    # 44.0

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->A:J

    const/16 v15, 0x24

    invoke-static {v15}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->B:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->C:J

    sput-object v6, LC/g;->D:Lz0/l;

    sput-object v0, LC/g;->E:Lz0/n;

    const-wide/high16 v15, 0x4044000000000000L    # 40.0

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->F:J

    const/16 v15, 0x20

    invoke-static {v15}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->G:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->H:J

    sput-object v6, LC/g;->I:Lz0/l;

    sput-object v0, LC/g;->J:Lz0/n;

    const-wide/high16 v15, 0x4042000000000000L    # 36.0

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->K:J

    const/16 v15, 0x1c

    invoke-static {v15}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->L:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->M:J

    sput-object v6, LC/g;->N:Lz0/l;

    sput-object v0, LC/g;->O:Lz0/n;

    const-wide/high16 v15, 0x4040000000000000L    # 32.0

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->P:J

    const/16 v15, 0x18

    invoke-static {v15}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->Q:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->R:J

    sput-object v6, LC/g;->S:Lz0/l;

    sput-object v0, LC/g;->T:Lz0/n;

    invoke-static {v7, v8}, La/a;->K(D)J

    move-result-wide v15

    sput-wide v15, LC/g;->U:J

    invoke-static {v9}, La/a;->L(I)J

    move-result-wide v15

    sput-wide v15, LC/g;->V:J

    const-wide v15, 0x3fb999999999999aL    # 0.1

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v17

    sput-wide v17, LC/g;->W:J

    sget-object v17, LC/h;->a:Lz0/l;

    sput-object v17, LC/g;->X:Lz0/l;

    sput-object v0, LC/g;->Y:Lz0/n;

    invoke-static {v12, v13}, La/a;->K(D)J

    move-result-wide v19

    sput-wide v19, LC/g;->Z:J

    invoke-static {v14}, La/a;->L(I)J

    move-result-wide v19

    sput-wide v19, LC/g;->a0:J

    invoke-static {v4, v5}, La/a;->K(D)J

    move-result-wide v19

    sput-wide v19, LC/g;->b0:J

    sput-object v17, LC/g;->c0:Lz0/l;

    sput-object v0, LC/g;->d0:Lz0/n;

    invoke-static {v12, v13}, La/a;->K(D)J

    move-result-wide v12

    sput-wide v12, LC/g;->e0:J

    const/16 v12, 0xb

    invoke-static {v12}, La/a;->L(I)J

    move-result-wide v12

    sput-wide v12, LC/g;->f0:J

    invoke-static {v4, v5}, La/a;->K(D)J

    move-result-wide v4

    sput-wide v4, LC/g;->g0:J

    sput-object v17, LC/g;->h0:Lz0/l;

    sput-object v0, LC/g;->i0:Lz0/n;

    const-wide/high16 v4, 0x403c000000000000L    # 28.0

    invoke-static {v4, v5}, La/a;->K(D)J

    move-result-wide v4

    sput-wide v4, LC/g;->j0:J

    const/16 v4, 0x16

    invoke-static {v4}, La/a;->L(I)J

    move-result-wide v4

    sput-wide v4, LC/g;->k0:J

    invoke-static {v10, v11}, La/a;->K(D)J

    move-result-wide v4

    sput-wide v4, LC/g;->l0:J

    sput-object v6, LC/g;->m0:Lz0/l;

    sput-object v0, LC/g;->n0:Lz0/n;

    invoke-static {v1, v2}, La/a;->K(D)J

    move-result-wide v1

    sput-wide v1, LC/g;->o0:J

    invoke-static {v3}, La/a;->L(I)J

    move-result-wide v1

    sput-wide v1, LC/g;->p0:J

    const-wide v1, 0x3fc999999999999aL    # 0.2

    invoke-static {v1, v2}, La/a;->K(D)J

    move-result-wide v1

    sput-wide v1, LC/g;->q0:J

    sput-object v17, LC/g;->r0:Lz0/l;

    sput-object v0, LC/g;->s0:Lz0/n;

    invoke-static {v7, v8}, La/a;->K(D)J

    move-result-wide v0

    sput-wide v0, LC/g;->t0:J

    invoke-static {v9}, La/a;->L(I)J

    move-result-wide v0

    sput-wide v0, LC/g;->u0:J

    invoke-static/range {v15 .. v16}, La/a;->K(D)J

    move-result-wide v0

    sput-wide v0, LC/g;->v0:J

    sput-object v17, LC/g;->w0:Lz0/l;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot perform operation for Unspecified type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
